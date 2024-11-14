package net.mcreator.createpyrotechnics.procedures;

public class RoundNumForDisplayProcedure {
	public static String execute(double num) {
		String txt = "";
		txt = "" + num;
		return txt.substring(0, (int) (txt.indexOf(".", 0) + 4));
	}
}
