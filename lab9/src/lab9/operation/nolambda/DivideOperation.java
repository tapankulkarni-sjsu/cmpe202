package lab9.operation.nolambda;

import lab9.operation.Operation;

public class DivideOperation implements Operation{

	@Override
	public int execute(int x, int y) {
		return x/y;
	}

}
