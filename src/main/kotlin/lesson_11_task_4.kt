package lesson_11

class Store(
    val coverStore: String,
    val nameStore: String,
    val listWindowsStore: MutableList<WindowsStore>
)

class WindowsStore(
    val coverWindows: String,
    val nameWindow: String,
    val listCategoryWindow: MutableList<CategoryDishes> = mutableListOf(),
    val listFavoriteDishesWindow: MutableList<Dishes> = mutableListOf(),
) {

    fun addInFavoriteDishes(listFavoriteDishesWindow: MutableList<Dishes>) {
        println(nameWindow)
        println(coverWindows)
        if (listFavoriteDishesWindow.size == 0) {
            println("категория ${nameWindow} пуста")
        } else {
            for (i in 0..listFavoriteDishesWindow.size - 1) {
                listFavoriteDishesWindow.add(listFavoriteDishesWindow[i])
                println(listFavoriteDishesWindow)
            }
        }
    }

    fun addCategoryDishes(listCategoryWindow: MutableList<CategoryDishes>) {
        println(nameWindow)
        println(coverWindows)
        for (i in 0..listCategoryWindow.size - 1) {
            listCategoryWindow.add(listCategoryWindow[i])
            println(listCategoryWindow[i].name)
        }
    }


}

class CategoryDishes(
    val cover: String = "",
    val name: String,
    val diversityDish: MutableList<Dishes>,
    var inFavorites: Boolean = false,
) {
    fun addDishes(diversityDish: MutableList<Dishes>) {
        println(name)
        println(cover)
        for (i in 0..diversityDish.size - 1) {
            diversityDish.add(diversityDish[i])
            println(diversityDish[i].name)
        }
    }
}


class Dishes(
    val cover: String,
    val name: String,
    val ingredients: MutableList<String> = mutableListOf(),
    var inFavorites: Boolean = false,
)

fun main() {

    val burger1: Dishes = Dishes("", "бургер1", mutableListOf("мука", "вода", "соль"))
    val burger2: Dishes = Dishes("", "чизбургер", mutableListOf("мука", "вода", "соль"))
    val burger3: Dishes = Dishes("", "бургер с грибами", mutableListOf("мука","вода", "грибы", "соль"))
    val pizza1: Dishes = Dishes("", "пицца 1", mutableListOf("мука", "вода", "соль"))
    val pizza2: Dishes = Dishes("", "пицца 2", mutableListOf("мука", "вода", "соль"))
    val pizza3: Dishes = Dishes("", "пицца 3", mutableListOf("мука", "вода", "соль"))
    val dessert1: Dishes = Dishes("", "десерт1", mutableListOf("сахар", "мука", "вода", "соль"))
    val dessert2: Dishes = Dishes("", "десерт2", mutableListOf("сахар", "мука", "вода", "соль"))
    val dessert3: Dishes = Dishes("", "десерт3", mutableListOf("сахар", "мука", "вода", "соль"))
    val fish1: Dishes = Dishes("", "рыба1", mutableListOf("рыба", "мука", "вода", "соль"))
    val fish2: Dishes = Dishes("", "рыба2", mutableListOf("рыба", "мука", "вода", "соль"))
    val fish3: Dishes = Dishes("", "рыба3", mutableListOf("рыба", "мука", "вода", "соль"))

    val burgerDish = CategoryDishes("фото аппетитного бургера", "БУРГЕРЫ", mutableListOf(burger1, burger2, burger3))
    val pizzaDish =
        CategoryDishes("фото большой пиццы на деревянном блюде", "ПИЦЦА", mutableListOf(pizza1, pizza2, pizza3))
    val fishDish = CategoryDishes("Фото жаренной рыбы на блюде", "РЫБА", mutableListOf(fish1, fish2, fish3))
    val dessertDish = CategoryDishes("Фото пирожных", "ДЕСЕРТЫ", mutableListOf(dessert1, dessert2, dessert3))

    val windowsCategoryDishes = WindowsStore(
        coverWindows = "Обложка:Фото разнообразных блюд",
        nameWindow = "ОКНО : КАТЕГОРИИ",
        listCategoryWindow = mutableListOf<CategoryDishes>(burgerDish, pizzaDish, fishDish, dessertDish),
    )
    val windowsFavoriteDishes = WindowsStore(
        coverWindows = "Обложка:Фото самых популярных блюд",
        nameWindow = "ОКНО : ИЗБРАННОЕ",
        listFavoriteDishesWindow = mutableListOf<Dishes>(),
    )
    val recipesStore = Store(
        coverStore = "Надпись на фоне с названием Recipes",
        nameStore = "Recipes",
        listWindowsStore = mutableListOf<WindowsStore>(windowsCategoryDishes, windowsFavoriteDishes),
    )
    println(recipesStore.nameStore)
    println(recipesStore.coverStore)

    windowsCategoryDishes.addCategoryDishes(mutableListOf<CategoryDishes>(burgerDish, pizzaDish, fishDish, dessertDish))
    windowsFavoriteDishes.addInFavoriteDishes(mutableListOf<Dishes>())
    burgerDish.addDishes(mutableListOf<Dishes>(burger1, burger2, burger3))
    guide(burgerDish, pizzaDish, dessertDish, fishDish)

}

fun guide(
    burgerDish: CategoryDishes,
    pizzaDish: CategoryDishes,
    dessertDish: CategoryDishes,
    fishDish: CategoryDishes
) {
    println("Выбрать категорию блюд для просмотра ассортимента блюд- введите в консоль 1")
    println("Добавить категорию в избранное - введите в консоль 2")
    println("Выйти из Recipes - введите в консоль 0")
    var key: Int = readln().toInt()

    when {
        (key == 0) -> return
        (key == 1) -> {
            println("Ввведите в консоль название категории блюда, чтобы просмотреть ассортимент этой категории блюд")
            var key1 = readln().toString()
            when {
                (key1 == "БУРГЕРЫ") -> println("${burgerDish.diversityDish[0].name},${burgerDish.diversityDish[1].name},${burgerDish.diversityDish[2].name}")
                (key1 == "ПИЦЦА") -> println("${pizzaDish.diversityDish[0].name},${pizzaDish.diversityDish[1].name},${pizzaDish.diversityDish[2].name}")
                (key1 == "РЫБА") -> println("${fishDish.diversityDish[0].name},${fishDish.diversityDish[1].name},${fishDish.diversityDish[2].name}")
                (key1 == "ДЕСЕРТЫ") -> ("${dessertDish.diversityDish[0].name},${dessertDish.diversityDish[1].name},${dessertDish.diversityDish[2].name}")
            }

        }

        (key == 2) -> {
            println("Ввведите в консоль название категории блюда для записи этой категории в избранное")
            var key1 = readln().toString()
            when {
                (key1 == "БУРГЕРЫ") -> {
                    burgerDish.inFavorites = true
                    println("Категория блюда ${burgerDish.name} добавлена в избранное")
                }

                (key1 == "ПИЦЦА") -> println {
                    pizzaDish.inFavorites = true
                    println("Категория блюда ${pizzaDish.name} добавлена в избранное")
                }

                (key1 == "РЫБА") -> {
                    fishDish.inFavorites = true
                    println("Категория блюда ${fishDish.name} добавлена в избранное")
                }

                (key1 == "ДЕСЕРТЫ") -> {
                    dessertDish.inFavorites = true
                    println("Категория блюда ${dessertDish.name} добавлена в избранное")
                }
            }

        }
    }
}

