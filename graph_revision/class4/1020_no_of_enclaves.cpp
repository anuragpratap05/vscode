#include<bits/stdc++.h>
using namespace std;


vector<vector<int>> dir={{-1,0},{0,1},{1,0},{0,-1}};
void dfs(vector<vector<int>>& grid,int i,int j,int n,int m)
{
    grid[i][j]=0;
    for(auto vec:dir)
    {
        int r=i+vec[0];
        int c=j+vec[1];
        if(r>=0 and c>=0 and r<n and c<m and grid[r][c]==1)
        {
            
            dfs(grid,r,c,n,m);
        }
    }
}
int solve(vector<vector<int>>& board)
{
    int n=board.size();
    int m=board[0].size();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if((i==0 or j==0 or i==n-1 or j==m-1)and board[i][j]==1)
            {
                dfs(board,i,j,n,m);
            }
        }
    } 
    int c=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(board[i][j]==1)
            {
                c++;
            }
            
        }
    }  
    return c; 
    //return board;    
}
int numEnclaves(vector<vector<int>>& grid)
{
    return solve(grid);
}
int main()
{
    return 0;
}