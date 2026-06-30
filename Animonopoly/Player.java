import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int playerTurn[] = {1,2};
    int playerMoney[] = {0,0};
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act()
    {
        
    }
    private void moveSpace(int turn, int pos)
    {
        
    }  
    private int cardDraw(int cardNum, int money)
    {
        int total = 0;
        int correctCardNum = cardNum + 1;
        switch(correctCardNum)
        {
            case 1:
                total = money - 10;
                break;
            case 2:
                total = money + 50;
                break;
            case 3: 
                total = money + 75;
                break;
            case 4:
                total = money + 100;
                break;
            case 5:
                total = money + 150;
                break;
            case 6:
                total = money + 250;
                break;
            case 7:
                total = money + 300;
                break;
            case 8:
                total = money + 500;
                break;
            case 9:
                total = money + 750;
                break;
            case 10:
                total = money + 1000;
                break;
            case 11:
                total = money - 10;
                break;
            case 12:
                total = money - 50;
                break;
            case 13: 
                total = money - 75;
                break;
            case 14:
                total = money - 100;
                break;
            case 15:
                total = money - 150;
                break;
            case 16:
                total = money - 250;
                break;
            case 17:
                total = money - 300;
                break;
            case 18:
                total = money - 500;
                break;
            case 19:
                total = money - 750;
                break;
            case 20:
                total = money - 1000;
                break;
            
        }
        return total;
    }
    private int playerLose(int money1, int money2)
    {
        if(money1 <= 0)
        {
            return 1;
        }
        else if(money2 <= 0)
        {
            return 2;
        }
        else if (money2 <= 0 && money1 <= 0)
        {
            return 3;
        }
        else
        {return 0;
        }
    }
    private int playerWin(boolean status1, boolean status2)
    {
        if(status1 == false)
        {
            return 2;
        }
        else if (status2 == false)
        {
            return 1;
        }
        else if (status1 == false && status2 == false)
        {
            return 3;
        }
        else
        {return 0;
        }
    }
}