package library;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.reporters.JUnitReportReporter;

import junit.framework.Test;
import junit.framework.TestSuite;


@SuppressWarnings("unused")
@RunWith(Suite.class)
@SuiteClasses({ 
MapNav.class,
DealerInput.class,
ExternalDealers.class,
PageLoads.class,
ResponsivePageLoads.class,
PutMeIn.class,
RequestQuote.class,

 })
public class RunAll {
}