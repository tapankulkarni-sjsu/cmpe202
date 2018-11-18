package lab9.operation.withlambda;

import lab9.operation.DataOperation;
import lab9.operation.nolambda.OperationType;

public class DataOperatorWithLambda implements DataOperation{

	private DataOperationExecutor executor = new DataOperationExecutor(); 
	
	@Override
	public int operate(int x, int y, OperationType operationType) {
		System.out.println("With lambda : "+x + "\t" + operationType + "\t"+y);
		int result = executor.execute(x,y, operationType);
		System.out.println("Result = "+result);
		return result;
	}

	
}
