package com.example.foodspot.data.repository

import com.example.foodspot.data.model.Dish
import com.example.foodspot.data.model.Restaurant

interface FoodRepository {
    fun getAllRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
}

class FoodRepositoryImpl : FoodRepository {

    override fun getAllRestaurants(): List<Restaurant> = sampleRestaurants

    override fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }

    private val sampleRestaurants = listOf(
        Restaurant(
            id = 1,
            name = "Burger House",
            description = "Las mejores hamburguesas estilo americano.",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=800",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(101, "Classic Burger", "Carne de res, queso, lechuga y tomate", "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&w=800"),
                Dish(102, "Bacon Cheeseburger", "Doble tocino, queso cheddar y salsa BBQ", "https://images.unsplash.com/photo-1572802419224-296b0aeee0d9?q=80&w=800"),
                Dish(103, "Onion Rings", "Aros de cebolla crujientes con aderezo ranch", "https://images.unsplash.com/photo-1639024471283-03518883512d?q=80&w=800")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pizza Place",
            description = "Pizzas artesanales en horno de leña.",
            imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?q=80&w=800",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(201, "Margarita", "Salsa de tomate, mozzarella fresca y albahaca", "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?q=80&w=800"),
                Dish(202, "Pepperoni", "Clásica pizza con extra pepperoni y queso", "https://images.unsplash.com/photo-1628840042765-356cda07504e?q=80&w=800"),
                Dish(203, "Cuatro Quesos", "Mezcla de parmesano, mozzarella, gorgonzola y provolone", "https://images.unsplash.com/photo-1513104890138-7c749659a591?q=80&w=800")
            )
        ),
        Restaurant(
            id = 3,
            name = "Sushi Bar",
            description = "El mejor sushi y comida tradicional japonesa.",
            imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=800",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(301, "Spicy Tuna Roll", "Rollo de atún picante con aguacate", "https://images.unsplash.com/photo-1553621042-f6e147245754?q=80&w=800"),
                Dish(302, "Nigiri Salmon", "Corte fresco de salmón sobre arroz", "https://images.unsplash.com/photo-1675209705883-7aec595f5aa8?q=80&w=800"),
                Dish(303, "Ramen Tonkotsu", "Sopa tradicional con fideos y cerdo ahumado", "https://images.unsplash.com/photo-1552611052-33e04de081de?q=80&w=800")
            )
        ),
        Restaurant(
            id = 4,
            name = "Green Bowl",
            description = "Opciones saludables, ensaladas y bowls frescos.",
            imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=800",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(401, "César Salad", "Lechuga romana, crutones, parmesano y aderezo", "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?q=80&w=800"),
                Dish(402, "Quinoa Bowl", "Quinoa, aguacate, tomate cherry y espinaca", "https://images.unsplash.com/photo-1546069901-ba9599a7e63c?q=80&w=800"),
                Dish(403, "Smoothie Verde", "Bebida detox de espinaca, manzana y apio", "https://images.unsplash.com/photo-1765162007672-54ccd9b0e54b?q=80&w=800")
            )
        ),
        Restaurant(
            id = 5,
            name = "Pollo Loco",
            description = "Pollo frito crujiente con recetas secretas.",
            imageUrl = "https://images.unsplash.com/photo-1626082927389-6cd097cdc6ec?q=80&w=800",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(501, "Combo Familiar", "8 piezas de pollo, papas y ensalada", "https://images.unsplash.com/photo-1570013217291-c03c7d5a8de2?q=80&w=800"),
                Dish(502, "Crispy Tenders", "Tiras de pollo empanizadas con salsa miel mostaza", "https://images.unsplash.com/photo-1562967914-608f82629710?q=80&w=800"),
                Dish(503, "Papas Fritas", "Porción grande de papas fritas doradas", "https://images.unsplash.com/photo-1723763246578-99e614b2a91b?q=80&w=800")
            )
        ),
        Restaurant(
            id = 6,
            name = "La Trattoria",
            description = "Auténtica comida del sur de Italia.",
            imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?q=80&w=800",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(601, "Pasta Carbonara", "Espagueti con guanciale, yema de huevo y pecorino", "https://images.unsplash.com/photo-1612874742237-6526221588e3?q=80&w=800"),
                Dish(602, "Lasagna de Carne", "Capas de pasta con ragú y bechamel", "https://images.unsplash.com/photo-1723584575255-d41c68261245?q=80&w=800"),
                Dish(603, "Tiramisú", "Postre clásico italiano con café y mascarpone", "https://images.unsplash.com/photo-1571115177098-24ec42ed204d?q=80&w=800")
            )
        ),
        Restaurant(
            id = 7,
            name = "Wok Express",
            description = "Comida rápida china hecha al wok.",
            imageUrl = "https://images.unsplash.com/photo-1585032226651-759b368d7246?q=80&w=800",
            categories = listOf("Asiática", "Comida Rápida"),
            menu = listOf(
                Dish(701, "Arroz Frito", "Arroz salteado con vegetales y pollo", "https://images.unsplash.com/photo-1603133872878-684f208fb84b?q=80&w=800"),
                Dish(702, "Pollo Agridulce", "Trozos de pollo bañados en salsa agridulce", "https://images.unsplash.com/photo-1525755662778-989d0524087e?q=80&w=800"),
                Dish(703, "Rollitos de Primavera", "Rollos fritos rellenos de vegetales", "https://images.unsplash.com/photo-1669340781012-ae89fbac9fc3?q=80&w=800")
            )
        ),
        Restaurant(
            id = 8,
            name = "Tacos Mex",
            description = "Los mejores tacos al pastor y carnitas.",
            imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=800",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(801, "Tacos al Pastor", "Orden de 3 tacos con piña y cebolla", "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=800"),
                Dish(802, "Quesadilla", "Tortilla de harina con queso fundido y carne", "https://images.unsplash.com/photo-1615870216519-2f9fa575fa5c?q=80&w=800"),
                Dish(803, "Nachos con Guacamole", "Totopos bañados en queso y guacamole fresco", "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=800")
            )
        ),
        Restaurant(
            id = 9,
            name = "Sweet & Coffee",
            description = "Café de especialidad y postres horneados.",
            imageUrl = "https://images.unsplash.com/photo-1554118811-1e0d58224f24?q=80&w=800",
            categories = listOf("Postres", "Bebidas"),
            menu = listOf(
                Dish(901, "Capuccino", "Café espresso con leche espumada", "https://images.unsplash.com/photo-1534778101976-62847782c213?q=80&w=800"),
                Dish(902, "Cheesecake", "Pastel de queso con salsa de fresa", "https://images.unsplash.com/photo-1533134242443-d4fd215305ad?q=80&w=800"),
                Dish(903, "Brownie", "Brownie de chocolate caliente con nueces", "https://images.unsplash.com/photo-1606890737304-57a1ca8a5b62?q=80&w=800")
            )
        ),
        Restaurant(
            id = 10,
            name = "Pho Saigon",
            description = "Sopas Pho y especialidades vietnamitas.",
            imageUrl = "https://images.unsplash.com/photo-1631709497146-a239ef373cf1?q=80&w=800",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(1001, "Pho Bo", "Sopa tradicional de res con fideos de arroz", "https://images.unsplash.com/photo-1665593998976-d957f2827fe7?q=80&w=800"),
                Dish(1002, "Banh Mi", "Sándwich vietnamita de cerdo y vegetales encurtidos", "https://images.unsplash.com/photo-1621852004158-f3bc188ace2d?q=80&w=800"),
                Dish(1003, "Spring Rolls Frescos", "Rollos de papel de arroz rellenos de camarón", "https://images.unsplash.com/photo-1553701275-1d6118df60bf?q=80&w=800")
            )
        )
    )
}