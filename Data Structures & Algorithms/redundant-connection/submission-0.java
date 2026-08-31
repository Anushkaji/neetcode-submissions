class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n= edges.length;
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
            boolean[] visited=new boolean[n+1];
            if(dfs(edge[0],-1,visited,adj)) return edge;

        }
        return new int[0];
    }
    public boolean dfs(int node, int parent,boolean[] visited,List<List<Integer>> adj){
        if(visited[node]) return true;
        visited[node]=true;
        for(int nei:adj.get(node)){
            if(nei==parent) continue;
            if(dfs(nei,node,visited,adj)) return true;
        }
        return false;
    }
}