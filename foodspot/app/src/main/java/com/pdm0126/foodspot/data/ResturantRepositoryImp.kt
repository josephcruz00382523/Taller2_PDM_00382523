package com.pdm0126.foodspot.data

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant




class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(

        Restaurant(
            id = 1,
            name = "Pizza Place",
            description = "Las mejores pizzas artesanales de la ciudad, con ingredientes frescos importados.",
            imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=1025",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(
                    1, "Pizza Margarita", "Mozzarella fresca, albahaca y salsa de tomate casera",
                    "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
                ),
                Dish(
                    2, "Pizza Pepperoni", "Pepperoni, mozzarella y salsa picante opcional",
                    "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=1176"
                ),
                Dish(
                    3, "Pizza Cuatro Quesos", "Mozzarella, parmesano, gorgonzola y ricotta",
                    "https://images.unsplash.com/photo-1513104890138-7c749659a591?q=80&w=1000"
                ),
                Dish(
                    4, "Pizza Hawaiana", "Jamón, piña, mozzarella y salsa de tomate",
                    "https://images.unsplash.com/photo-1571407970349-bc81e7e96d47?q=80&w=1025"
                )
            )
        ),

        Restaurant(
            id = 2,
            name = "Bella Pasta",
            description = "Pasta fresca hecha a mano todos los días con recetas del norte de Italia.",
            imageUrl = "https://images.unsplash.com/photo-1555949258-eb67b1ef0ceb?q=80&w=1170",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(5, "Spaghetti Carbonara", "Tocino, huevo, parmesano y pimienta negra",
                    "https://images.unsplash.com/photo-1612874742237-6526221588e3?q=80&w=1171"),
                Dish(6, "Fettuccine Alfredo", "Crema, mantequilla y parmesano gratinado",
                    "https://images.unsplash.com/photo-1645112411341-6c4fd023882b?q=80&w=1170"),
                Dish(7, "Lasagna Bolognesa", "Capas de pasta, carne molida y bechamel",
                    "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?q=80&w=1035")
            )
        ),

        Restaurant(
            id = 3,
            name = "Burger House",
            description = "Hamburguesas jugosas con carne de res 100% natural y pan brioche artesanal.",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=999",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(8, "Classic Burger", "Carne de res, lechuga, tomate, cebolla y mostaza",
                    "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=999"),
                Dish(9, "BBQ Bacon Burger", "Tocino crujiente, queso cheddar y salsa BBQ ahumada",
                    "https://images.unsplash.com/photo-1553979459-d2229ba7433b?q=80&w=1168"),
                Dish(10, "Chicken Crispy", "Pollo empanizado, pepinillos y mayonesa de ajo",
                    "https://images.unsplash.com/photo-1606755962773-d324e0a13086?q=80&w=987"),
                Dish(11, "Papas Fritas XL", "Papas crujientes con sal de mar y aderezo ranch",
                    "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?q=80&w=987")
            )
        ),

        Restaurant(
            id = 4,
            name = "Tacos Mex",
            description = "Tacos auténticos estilo mexicano con tortilla de maíz hecha a mano.",
            imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=980",
            categories = listOf("Comida Rápida", "Mexicana"),
            menu = listOf(
                Dish(12, "Taco de Pastor", "Cerdo marinado en achiote, piña y cilantro",
                    "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?q=80&w=1094"),
                Dish(13, "Taco de Birria", "Carne de res estofada con consomé para dippear",
                    "https://images.unsplash.com/photo-1624300629298-e9de39c13be5?q=80&w=987"),
                Dish(14, "Quesadilla de Pollo", "Tortilla de harina, pollo a la plancha y queso Oaxaca",
                    "https://images.unsplash.com/photo-1618040996337-56904b7850b9?q=80&w=1064")
            )
        ),

        Restaurant(
            id = 5,
            name = "Sushi Bar",
            description = "Sushi fresco preparado por chefs con experiencia en Japón.",
            imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=1170",
            categories = listOf("Asiática", "Japonesa"),
            menu = listOf(
                Dish(15, "Roll Spicy Tuna", "Atún picante, pepino y salsa sriracha",
                    "https://images.unsplash.com/photo-1617196034183-421b4040ed20?q=80&w=987"),
                Dish(16, "Sashimi Salmón", "Láminas de salmón fresco con jengibre y wasabi",
                    "https://images.unsplash.com/photo-1534482421-64566f976cfa?q=80&w=1169"),
                Dish(17, "Ramen Tonkotsu", "Caldo de cerdo, fideos, huevo marinado y nori",
                    "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?q=80&w=1160"),
                Dish(18, "Gyozas al Vapor", "Dumplings de cerdo y vegetales con salsa ponzu",
                    "https://images.unsplash.com/photo-1496116218417-1a781b1c416c?q=80&w=1170")
            )
        ),

        Restaurant(
            id = 6,
            name = "Wok Express",
            description = "Cocina china rápida y sabrosa con wok a fuego alto para sellado perfecto.",
            imageUrl = "https://images.unsplash.com/photo-1563245372-f21724e3856d?q=80&w=1024",
            categories = listOf("Asiática", "China"),
            menu = listOf(
                Dish(19, "Arroz Frito Especial", "Arroz, huevo, camarones, zanahoria y salsa de soya",
                    "https://images.unsplash.com/photo-1603133872878-684f208fb84b?q=80&w=1025"),
                Dish(20, "Chow Mein de Pollo", "Fideos salteados con pollo, brócoli y salsa de ostión",
                    "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?q=80&w=1160"),
                Dish(21, "Cerdo Agridulce", "Cerdo crujiente bañado en salsa agridulce con piña",
                    "https://images.unsplash.com/photo-1625938144755-652e08e359b7?q=80&w=1170")
            )
        ),

        Restaurant(
            id = 7,
            name = "Green Bowl",
            description = "Bowls nutritivos y ensaladas frescas para una alimentación equilibrada.",
            imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=1170",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(22, "Buddha Bowl", "Quinoa, garbanzos, aguacate, zanahoria y tahini",
                    "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=1170"),
                Dish(23, "Ensalada César", "Lechuga romana, crutones, parmesano y aderezo clásico",
                    "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?q=80&w=1170"),
                Dish(24, "Wrap de Atún", "Tortilla integral, atún, aguacate y vegetales frescos",
                    "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=1064"),
                Dish(25, "Smoothie Bowl", "Açaí, plátano, granola, miel y frutas frescas",
                    "https://images.unsplash.com/photo-1490323914169-4b48e6b7a2d7?q=80&w=1170")
            )
        ),

        Restaurant(
            id = 8,
            name = "Pollo Loco",
            description = "Pollo a la plancha y asado con marinadas naturales, sin freidoras.",
            imageUrl = "https://images.unsplash.com/photo-1598103442097-8b74394b95c1?q=80&w=1176",
            categories = listOf("Saludable", "Comida Rápida"),
            menu = listOf(
                Dish(26, "Pollo a la Plancha", "Pechuga marinada con hierbas, limón y ajo",
                    "https://images.unsplash.com/photo-1598103442097-8b74394b95c1?q=80&w=1176"),
                Dish(27, "Wrap de Pollo BBQ", "Pollo asado, lechuga, tomate y salsa BBQ en tortilla",
                    "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=1064"),
                Dish(28, "Arroz con Pollo", "Arroz azafranado con pollo estofado y vegetales",
                    "https://images.unsplash.com/photo-1512058564366-18510be2db19?q=80&w=1172")
            )
        ),

        Restaurant(
            id = 9,
            name = "Sweet Corner",
            description = "Postres artesanales horneados cada mañana con recetas de pastelería francesa.",
            imageUrl = "https://images.unsplash.com/photo-1488477181946-6428a0291777?q=80&w=987",
            categories = listOf("Postres"),
            menu = listOf(
                Dish(29, "Cheesecake de Fresa", "Base de galleta, queso crema y coulis de fresa",
                    "https://images.unsplash.com/photo-1488477181946-6428a0291777?q=80&w=987"),
                Dish(30, "Brownie con Helado", "Brownie de chocolate caliente con helado de vainilla",
                    "https://images.unsplash.com/photo-1564355808539-22fda35bed7e?q=80&w=987"),
                Dish(31, "Crepes de Nutella", "Crepes finas con Nutella, plátano y crema chantilly",
                    "https://images.unsplash.com/photo-1519676867240-f03562e64548?q=80&w=1025"),
                Dish(32, "Tiramisú", "Bizcochos al café, mascarpone y cacao en polvo",
                    "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?q=80&w=987")
            )
        ),

        Restaurant(
            id = 10,
            name = "Juice Lab",
            description = "Jugos naturales, batidos proteicos y bebidas frías preparadas al momento.",
            imageUrl = "https://images.unsplash.com/photo-1589733955941-5eeaf752f6dd?q=80&w=1170",
            categories = listOf("Bebidas", "Saludable"),
            menu = listOf(
                Dish(33, "Jugo Verde Detox", "Espinaca, pepino, manzana verde, jengibre y limón",
                    "https://images.unsplash.com/photo-1610970881699-44a5587cabec?q=80&w=987"),
                Dish(34, "Batido Proteico", "Plátano, mantequilla de maní, leche de almendras y proteína",
                    "https://images.unsplash.com/photo-1553530979-212c9e72e48f?q=80&w=987"),
                Dish(35, "Limonada de Coco", "Limonada natural con leche de coco y hierbabuena",
                    "https://images.unsplash.com/photo-1621263764928-df1444c5e859?q=80&w=987"),
                Dish(36, "Café Frío Dalgona", "Café batido espumoso sobre leche fría con hielo",
                    "https://images.unsplash.com/photo-1578681994506-b8f463449011?q=80&w=987")
            )
        )
    )

    override fun getRestaurants(): List<Restaurant> = restaurants
    override fun getRestaurantById(id: Int): Restaurant? = restaurants.find { it.id == id }
}