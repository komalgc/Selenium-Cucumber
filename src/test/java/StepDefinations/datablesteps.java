package StepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;


public class datablesteps {


    @Given("^I placed an order for following items$")
    public void i_placed_an_order_for_following_items(DataTable datatable) {

        List<List<String>> Billdata = datatable.asLists(String.class);

        for (List<String> BillItems : Billdata) {

            for (String Billitem : BillItems) {
                System.out.println(Billitem);
            }
        }
    }

    @When("^I generate the bill$")
    public void i_generate_the_bill() throws Throwable {
        System.out.println("This is when Generated bill");
    }

    @Then("^a bill of \\$(\\d+) should be generated$")
    public void a_bill_of_$_should_be_generated(int arg1) throws Throwable {
        System.out.println("This is Then calculated bill");
    }
}
