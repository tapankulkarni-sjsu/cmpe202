package lab9.operation.nolambda;

import lab9.operation.DataOperation;
import lab9.operation.Operation;

public class DataOperatorWithoutLambda implements DataOperation{	
	
	private OperationFactory factory = new OperationFactory(); 
	
	@Override
	public int operate(int x, int y, OperationType operationType) {
		System.out.println("Without lambda : "+x + "\t" + operationType + "\t"+y);
		Operation operation = factory.getOperation(operationType);
		int result = operation.execute(x, y);
		System.out.println("Result = "+result);
		return result;
	}
}
