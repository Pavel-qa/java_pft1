package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModificcation();
        app.getGroupHelper().fillGroupForm(new GroupDate("test2", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();
    }

}
