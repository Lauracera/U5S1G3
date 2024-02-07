package com.epicode.U5D2;

import com.epicode.U5D2.entities.Menu;
import com.epicode.U5D2.entities.Pizza;
import com.epicode.U5D2.entities.Table;
import com.epicode.U5D2.entities.Topping;
import net.bytebuddy.implementation.bind.ArgumentTypeResolver;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testCheckTomatoAndCheese (){
        List<Topping> toppings = Arrays.asList(
                new Topping("Tomato", 0, 0),
                new Topping("Cheese", 92, 0.69),
        )
    }

    @Test
    public void testTableStatusBoolean(){
        Table table = new Table(1, 2, true, 1);

    }
}
