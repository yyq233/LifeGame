package LifeGame;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {

    @Test
    public void testDeleteAllCell() {
        Cell c=new Cell(20,20);
        c.randomCell();
        c.deleteAllCell();
        for (int i = 1; i <= 20; i++)
            for (int j = 1; j <= 20; j++)
                Assert.assertEquals( 0, c.getGrid()[i][j]);
    }

    @Test
    public void testUpdate(){
        Cell c=new Cell(3,3);
        int cell[][]=new int[5][5];
        cell[1][1]=1;
        cell[1][2]=0;
        cell[1][3]=0;
        cell[2][1]=0;
        cell[2][2]=1;
        cell[2][3]=0;
        cell[3][1]=1;
        cell[3][2]=0;
        cell[3][3]=1;
        c.setGrid(cell);
        c.update();
        Assert.assertEquals(1,c.getGrid()[2][2]);

    }

    @Test
    public void testGetNeighborCount(){
        Cell c=new Cell(3,3);
        int cell[][]=new int[5][5];
        cell[1][1]=1;
        cell[1][2]=0;
        cell[1][3]=0;
        cell[2][1]=0;
        cell[2][2]=1;
        cell[2][3]=0;
        cell[3][1]=1;
        cell[3][2]=0;
        cell[3][3]=1;
        c.setGrid(cell);
        Assert.assertEquals(3, c.getNeighborCount(2,2));
    }

}
