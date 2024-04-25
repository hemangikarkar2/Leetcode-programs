class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       int row[] = new int[m];
       int col[] = new int[n];
       for(int i=0; i<indices.length; i++){
        row[indices[i][0]]++;
        col[indices[i][1]]++;
       }

       int oddrows= 0;
        for(int i=0; i < m; i++){
            if(row[i]%2 ==1){
                oddrows++;
            }
        }
        int oddcols =0;
        for(int j=0; j < n; j++){
            if(col[j]%2==1){
                oddcols++;
            }
        }

        return oddrows*n + oddcols*m - 2*oddrows*oddcols;
            }
}

/**
Intuition
We have to count the cells that are incremented odd number of times. The indices can be though of as a list of rows and columns to be incremented, represented by 0th and 1st index respectively.

Lets consider our row list as list of 0th element of each indices element.
column list as list of 1st element of each indices element.

There are four categories of cells. For a cell [i, j] it can be
1. Not incremented at all. i does not belong to the row list and j does not belong the columns list. This has no contribution in the final odd count.
2. Only incremented through some row increment operation. i belongs to the row list but j does not belong to the columns list.
3. Only incremented through some column increment operation. i does not belong to the row list but j belongs to the columns list
4. Incremented both by row and column increment operations. i belongs to the row list and j belongs to the columns list. These will contribute if overall increment is odd number of times.

Any rows or columns incremented even number of times will not have any effect on the number of odd cells.

Approach
First compute the number of rows that are incremented odd number of times through row increment operations. It is simply finding the frequency of each row index in the row list. Total number of such cells will be m times the number of such rows.

Next find the number of columns incremented odd number of times through the column increment operations. Total number of such cells will be n times the number of such columns.

Finally intersection of such rows and columns have to be subtracted 2 times because they will become even after incrementing odd times both through columns and through rows. 2 times because these are added in both row and column increment computation.

Complexity
Time complexity:
$$O(m + n + indicesSize)$$ we have to iterate once through the indices, once through rows frequency and once through columns frequency.

Space complexity:
$$O(m + n)$$ for storing the frequencies.
**/
    