package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class MyStepDefs
{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationResultPage registrationResultPage=new RegistrationResultPage();
    NewsCommentPage newsCommentPage=new NewsCommentPage();
    NewsCommentResultPage  newsCommentResultPage=new NewsCommentResultPage();
    ComputerPage computerPage=new ComputerPage();
    DesktopPage desktopPage=new DesktopPage();
    BuildYourOwnComputerpage bulidyourOwnComputerPage=new BuildYourOwnComputerpage();
    ReferAProductTobeFriend referAProductTobeFriend=new ReferAProductTobeFriend();
    ReferAProductTobeFriendResultPage referAproductTobeFriendResultPage=new ReferAProductTobeFriendResultPage();


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickonRegisterButton();

    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.usercanAddRegistrationDetails();

    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {

    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserShouldbeabletoRegisterSuccesfully();
    }
    @Given("user click on New online store is open")
    public void user_click_on_new_online_store_is_open() {
        homePage.NewOnlineStoreIsOpen();

    }
    @When("user enters required Comments details")
    public void user_enters_required_comments_details() {
        newsCommentPage.userShouldbeAbletoEnterNewsCommentinNewsCommentbox();

    }
    @When("click on New Comment button")
    public void click_on_new_comment_button() {
        newsCommentPage.clickonnewscommentbutton();
    }
    @Then("user should able to add comment in NewsCommentPage successfully")
    public void user_should_able_to_add_comment_in_news_comment_page_successfully() {
        newsCommentResultPage.userAddedMessagenewsCommentSuccesfullyinPage();
    }
    @Given("user is on Homepage")
    public void user_is_on_homepage() {
        homePage.clickonRegisterButton();
    }
    @Given("user is on Computers category page")
    public void user_is_on_computers_category_page() {
     homePage.clickOnComputer();
    }
    @When("user Select desktops category")
    public void user_select_desktops_category() {
        computerPage.clickOnDesktop();
    }
    @Then("user should able to NavigateTodesktopPage Succesfully")
    public void user_should_able_to_navigate_todesktop_page_succesfully() {
     desktopPage.VerifyUsershouldBeabletoNavigateToDesktopPage();
    }

    @When("user click on Computers menu")
    public void user_click_on_computers_menu() {
        homePage.clickOnComputer();
    }
    @When("Select desktops category")
    public void select_desktops_category() {
     computerPage.clickOnDesktop();    }
    @When("Click on Build own Computer item")
    public void click_on_build_own_computer_item() {
        desktopPage.userCanClickOnBuildYourOwncomputer();
    }
    @When("Click on Email a Friend's button")
    public void click_on_email_a_friend_s_button() {
        bulidyourOwnComputerPage.ClickOnEmailFriendButton();
    }
    @When("user enters required emailFriend's Details")
    public void user_enters_required_email_friend_s_details() {
        referAProductTobeFriend.usercanenteremailfrienddetails();
    }
    @When("click on Send email button")
    public void click_on_send_email_button() {
      referAProductTobeFriend.clickOnEmailButton();
    }
    @Then("user should be able to Refer product to friend")
    public void user_should_be_able_to_refer_product_to_friend() {
        referAproductTobeFriendResultPage.verifyUserReferAProductToFriendSuccessFully();
    }
}
