package proxy;

public class HerChum implements GiveGift {
    You you;

    public HerChum(BeautifulGirl mm) {
        you = new You(mm);
    }

    public void giveFlowers() {
        you.giveFlowers();
    }

    public void giveChocolate() {
        you.giveChocolate();
    }

    public void giveBook() {
        you.giveBook();
    }
}
