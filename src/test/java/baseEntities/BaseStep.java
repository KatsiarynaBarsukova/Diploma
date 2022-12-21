package baseEntities;


import pages.*;

public class BaseStep {
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;

    public BaseStep() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();

    }
}