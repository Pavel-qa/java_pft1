package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class GroupDeletionsTest extends TestBase {

  @Test
  public void testGroupDeletions() throws Exception {
    app.gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnGroupPage();
  }

}