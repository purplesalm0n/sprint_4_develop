import org.junit.Test;
import ru.praktikum.scooter.pageobjects.MainPage;
import ru.praktikum.scooter.pageobjects.OrderPage;
import ru.praktikum.scooter.pageobjects.RentPage;
import static org.junit.Assert.assertTrue;

public class OrderTest extends CommonBaseTest {

    @Test
    public void samokatOrderingByHeaderOrderButton() {
        new MainPage(driver)
                .openSite()
                .clickCookieButton()
                .clickHeaderOrderButton();

        new OrderPage(driver)
                .sendClientFirstName("Вадим")
                .sendClientLastName("Поликанов")
                .sendDeliveryAddress("Москва, Семеновский Вал, 7")
                .selectMetroStation("Марьина Роща")
                .sendDeliveryClientPhoneNumber("89995206965")
                .clickNextButton();

        boolean isDisplayed = new RentPage(driver)
                .sendRentalDate("29.06.2025")
                .setRentalTime()
                .clickCheckBoxColourBlackPearl()
                .sendComment("Помоги господи")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();

        assertTrue("Отсутствует окно заказа", isDisplayed);
    }

    @Test
    public void samokatOrderingByMiddleOrderButton() {
        new MainPage(driver)
                .openSite()
                .clickCookieButton()
                .clickMiddleOrderButton();

        new OrderPage(driver)
                .sendClientFirstName("Стив")
                .sendClientLastName("Бушеми")
                .sendDeliveryAddress("Москва, Ленинградский вокзал, 1")
                .selectMetroStation("Павелецкая")
                .sendDeliveryClientPhoneNumber("89999999999")
                .clickNextButton();

        boolean isDisplayed = new RentPage(driver)
                .sendRentalDate("28.03.2022")
                .setRentalTime()
                .clickCheckBoxColourGreyDespair()
                .sendComment("Воздух")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();

        assertTrue("Отсутствует окно заказа", isDisplayed);
    }
}