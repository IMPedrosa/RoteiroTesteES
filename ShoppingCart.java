/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Exercício simples de teste de unidade (ShoppingCart)
*
*/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TesteShoppingCart {

  private ShoppingCart shoppingCart;

  @Before
  public void setUp() {
    shoppingCart = new ShoppingCart();
    shoppingCart.addItem(new Item("ESM", 65.0));
    shoppingCart.addItem(new Item("GoF", 120.0));
  }

  @Test
  public void testAddItem() {
    // Escreva aqui seu código de teste
    int initialSize = shoppingCart.getItemCount();
    shoppingCart.addItem(new Item("TP", 50.0));
    assertEquals(initialSize + 1, shoppingCart.getItemCount());
  }

  @Test
  public void testRemoveItem() {
    // Escreva aqui seu código de teste
    int numItens = shoppingCart.getItemCount();
    Item itemRemovido = shoppingCart.getItems().get(0);
    shoppingCart.removeItem(itemRemovido);
    assertEquals(numItens - 1, shoppingCart.getItemCount());
  }

  @Test
  public void testGetTotalPrice() {
    // Escreva aqui seu código de teste
    assertEquals(185.0, shoppingCart.getTotalPrice());
  }

  @Test
  public void testClearCart() {
    // Escreva aqui seu código de teste
    shoppingCart.clearCart();
    assertEquals(0, shoppingCart.getItemCount());
  }
}
