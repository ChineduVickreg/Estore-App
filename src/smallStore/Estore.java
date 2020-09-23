package smallStore;

import smallStore.User;

import java.util.ArrayList;
import java.util.List;

public class Estore {
    private String storeName;
    private List<User> registeredUsers = new ArrayList<>();
    private List<Products> addProducts = new ArrayList<>();

    public List<Products> getAddProducts() {
        return addProducts;
    }

    public void setAddProducts(List<Products> addProducts) {
        this.addProducts = addProducts;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void registerUser(User newUserForRegistration) {
        registeredUsers.add(newUserForRegistration);
    }
}
