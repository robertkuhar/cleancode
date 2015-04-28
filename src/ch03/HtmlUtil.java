package ch03;

import ch03.support.PageCrawlerImpl;
import ch03.support.PageData;
import ch03.support.PathParser;
import ch03.support.SuiteResponder;
import ch03.support.WikiPage;
import ch03.support.WikiPagePath;

/**
 * Chapter 03: Functions from "Clean Code" by Robert Martin.
 */
public class HtmlUtil {
  /**
   * Listing 3.1. Can you figure out what this does in under 3 minutes?
   * 
   * @param pageData
   * @param includeSuiteSetup
   * @return
   * @throws Exception
   */
  public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
    WikiPage wikiPage = pageData.getWikiPage();
    StringBuffer buffer = new StringBuffer();
    if (pageData.hasAttribute("Test")) {
      if (includeSuiteSetup) {
        WikiPage suiteSetup =
            PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
        if (suiteSetup != null) {
          WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
          String pagePathName = PathParser.render(pagePath);
          buffer.append("!include -setup .").append(pagePathName).append("\n");
        }
      }
      WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
      if (setup != null) {
        WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
        String setupPathName = PathParser.render(setupPath);
        buffer.append("!include -setup .").append(setupPathName).append("\n");
      }
    }
    buffer.append(pageData.getContent());
    if (pageData.hasAttribute("Test")) {
      WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
      if (teardown != null) {
        WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
        String tearDownPathName = PathParser.render(tearDownPath);
        buffer.append("\n").append("!include -teardown .").append(tearDownPathName).append("\n");
      }
      if (includeSuiteSetup) {
        WikiPage suiteTeardown =
            PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
        if (suiteTeardown != null) {
          WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
          String pagePathName = PathParser.render(pagePath);
          buffer.append("!include -teardown .").append(pagePathName).append("\n");
        }
      }
    }
    pageData.setContent(buffer.toString());
    return pageData.getHtml();
  }

  /**
   * Listing 3.3. Can you figure out what this does in under 3 minutes?
   * 
   * @param pageData
   * @param isSuite
   * @return
   * @throws Exception
   */
  public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite)
      throws Exception {
    if (isTestPage(pageData)) {
      includeSetupAndTeardownPages(pageData, isSuite);
    }
    return pageData.getHtml();
  }

  private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {
  }

  private static boolean isTestPage(PageData pageData) {
    return pageData.hasAttribute("Test");
  }

}
