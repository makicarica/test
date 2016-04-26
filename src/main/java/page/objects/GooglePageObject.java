package page.objects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

import java.text.MessageFormat;


public class GooglePageObject extends WebComponent{


    public enum GoogleHomePageLocators
    {
        INPUT_GOOGLE_SEARCH("lst-ib"),
        BTN_GOOGLE_SEARCH("sblsbb");


        private String myLocator;

        GoogleHomePageLocators(String locator){
            myLocator = locator;
        }

        public String get()
        {
            return myLocator;
        }

        public String getWithParams(Object... params)
        {
            return MessageFormat.format(myLocator, params);
        }

    }

    //input text to search on Google
    public void inputSearchText(String desiredText)
    {
        controller().input(GoogleHomePageLocators.INPUT_GOOGLE_SEARCH.get(), desiredText);
    }

    //press button search on Google
    public void pressGoogleSearchButton()
    {
        controller().press(GoogleHomePageLocators.BTN_GOOGLE_SEARCH.get());
    }

    //press link
    public void pressLink(String desiredText)
    {
        controller().pressLinkName(desiredText);
    }

}


