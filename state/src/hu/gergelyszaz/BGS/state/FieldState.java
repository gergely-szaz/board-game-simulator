package hu.gergelyszaz.BGS.state;

import java.util.ArrayList;

public class FieldState extends AbstractState{
	public String name;
	public ArrayList<Integer> neighbours = new ArrayList<>();
}