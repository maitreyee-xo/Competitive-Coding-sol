class Solution {
    public int minJumps(int[] arr) {
        if(arr.length == 1) return 0;
        if(arr[0] == arr[arr.length - 1]) return 1;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }

        List<Integer> curs = new LinkedList<>();
        curs.add(0);
        Set<Integer> visited = new HashSet<>();
        int step = 0;
        while (!curs.isEmpty()) {
            List<Integer> nex = new LinkedList<>();
            for (int node : curs) {
                if (node == arr.length - 1) {
                    return step;
                }
                for (int child : graph.get(arr[node])) {
                    if (!visited.contains(child)) {
                        visited.add(child);
                        nex.add(child);
                    }}
                graph.get(arr[node]).clear();
                if (node + 1 < arr.length && !visited.contains(node + 1)) {
                    visited.add(node + 1);
                    nex.add(node + 1);
                }
                if (node - 1 >= 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1);
                    nex.add(node - 1);
            }}

            curs = nex;
            step++;
        }
        return -1;
    }}