package proxy;

public class You implements GiveGift {
    /**
     * 美女
     */
    BeautifulGirl mm;

    public You(BeautifulGirl mm) {
        this.mm = mm;
    }

    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一朵花...");
    }

    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力...");
    }

    public void giveBook() {
        System.out.println(mm.getName() + ",送你一本书...");
    }
}
