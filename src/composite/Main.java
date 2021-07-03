package composite;


/**
 *
 * 组合模式
 *
 * 当 单体 与 整体 需要对外表现出接口一致性时，可以使用组合模式（如：word中对单个字修改字体，或对一段话修改字体）
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Company headoffice = new HeadOffice("总公司");

        Company subsidiary1 = new Subsidiary("子公司1");
        Company hrDepartment1 = new HRDepartment("子公司1的人力部门");
        Company financeDepartment1 = new FinanceDepartment("子公司1的资金部门");
        subsidiary1.add(hrDepartment1);
        subsidiary1.add(financeDepartment1);
        headoffice.add(subsidiary1);


        Company subsidiary2 = new Subsidiary("子公司2");
        Company financeDepartment2 = new FinanceDepartment("子公司1的资金部门");
        subsidiary2.add(financeDepartment2);
        headoffice.add(subsidiary2);

        headoffice.show();
    }
}
