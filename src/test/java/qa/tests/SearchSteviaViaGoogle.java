package qa.tests;

import com.persado.oss.quality.stevia.spring.SteviaTestBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.annotations.Test;
import page.objects.GooglePageObject;

import static org.testng.Assert.fail;

public class SearchSteviaViaGoogle extends SteviaTestBase {

    @Autowired
    protected GooglePageObject googlePageObject;

    @Test
    public void searchPersadoInGoogle() throws Exception{

            googlePageObject.pressGoogleSearchButton();
            googlePageObject.pressLink("GitHub - persado/stevia: Stevia is an Open Source QA ...");
            Thread.sleep(5000);
        }

//    catch (Exception e)
//        {
//            fail("Test failed", e);
//        }
//    }

}
