
public class TicTacToeBoard
{
    private String[][] board = new String[3][3];
    
    public TicTacToeBoard()
    {
        board[0][0] = "1";
        board[0][1] = "2";
        board[0][2] = "3";
        board[1][0] = "4";
        board[1][1] = "5";
        board[1][2] = "6";
        board[2][0] = "7";
        board[2][1] = "8";
        board[2][2] = "9";
    }
    
    public void enterX(int pos)
    {
        if (pos == 1)
            board[0][0] = "X";
        else if (pos == 2)
            board[0][1] = "X";
        else if (pos == 3)
            board[0][2] = "X";
        else if (pos == 4)
            board[1][0] = "X";
        else if (pos == 5)
            board[1][1] = "X";
        else if (pos == 6)
            board[1][2] = "X";
        else if (pos == 7)
            board[2][0] = "X";
        else if (pos == 8)
            board[2][1] = "X";
        else
            board[2][2] = "X";
    }
    
    public void enterO(int pos)
    {
        int count = 1;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j <3; j++)
            {
                if(count == pos)
                    board[i][j] = "O";
                count++;
            }
        }
    }
    
    public boolean checkRowsForWinner()
    {
        if(board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O"))
            return true;
        if(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))
            return true;
        if(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))
            return true;
        if(board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X"))
            return true;
        if(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X"))
            return true;
        if(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
            return true;
        return false;
    }
    
    public boolean checkColsForWinner()
    {
        for(int i = 0; i < 3; i++)
        {
            int countX = 0;
            int countO = 0;
            for(int j = 0; j < 3; j++)
            {
                if (board[j][i].equals("X"))
                    countX++;
                if (board[j][i].equals("O"))
                    countO++;
            }
            if(countX == 3 || countO == 3)
                return true;
        }
        return false;
    }
    
    public boolean checkDiagsForWinner()
    {
        if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
            return true;
        if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X"))
            return true;
        if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))
            return true;
        if(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O"))
            return true;
        return false;
    }
    
    public boolean checkForWinner()
    {
        if(checkRowsForWinner() || checkColsForWinner() || checkDiagsForWinner())
            return true;
        else 
            return false;
    }
    
    public String toString()
    {
        String matrix = "";
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                matrix += board[i][j] + " ";
            matrix += "\n";
        }
        return matrix;
    }
}
