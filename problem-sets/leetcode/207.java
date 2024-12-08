class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int size = numCourses;
        
        int[][] adj = new int[size][size];
        for (int[] row : prerequisites) adj[row[1]][row[0]] = 1;
        
        for (int i = 0; i < numCourses; i++) {
            boolean found = false;
            for (int row = 0; row < size; row++) {
                boolean hasPrerequisite = false;
                for (int col = 0; col < size; col++) {
                    if (adj[row][col] == 1) {
                        hasPrerequisite = true;
                        break;
                    }
                }

                if (!hasPrerequisite) {
                    found = true;
                    for (int col = 0; col < size; col++) {
                        adj[row][col] = 0;
                    }

                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }
}
