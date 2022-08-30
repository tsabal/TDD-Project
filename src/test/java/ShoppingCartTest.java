import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    @Test
    public void totalOfEmptyCart() {
        ShoppingCart cart = buildShoppingCart();
        assertEquals(0.0, cart.getTotal(), 0.0);
    }

    @Test
    public void totalOfSingleItem() {
        ShoppingCart cart = buildShoppingCart(new Item(100.0, 1));
        assertEquals(100.0, cart.getTotal(), 0.0);
    }

    @Test
    public void totalOfTwoItems() {
        ShoppingCart cart = buildShoppingCart(new Item(50.0, 1), new Item(75.0, 1));
        assertEquals(125.0, cart.getTotal(), 0.0);
    }

    @Test
    public void totalOfItemWithQuantityTwo() {
        ShoppingCart cart = buildShoppingCart(new Item(100.0, 2));
        assertEquals(200.0, cart.getTotal(), 0.0);
    }

    private ShoppingCart buildShoppingCart(Item... items) {
        return new ShoppingCart(Arrays.asList(items));
    }
}
