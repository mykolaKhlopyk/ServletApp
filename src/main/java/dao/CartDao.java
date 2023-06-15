package dao;

import entity.CartItem;

public interface CartDao {
    void removeShoppingCartItemWithId(int id);

    List<CartService.ShoppingCartProductInfo> getProductsFromCart(int userId);

    void addProductToCart(CartItem item);
}

