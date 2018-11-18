package lab9;

import lab9.operation.DataOperation;
import lab9.operation.nolambda.DataOperatorWithoutLambda;
import lab9.operation.nolambda.OperationType;
import lab9.operation.withlambda.DataOperatorWithLambda;

public class Main {

	public static void main(String[] args) {
		System.out.println("Without lamda");
		DataOperation dataOperation = new DataOperatorWithoutLambda();
		dataOperation.operate(4, 2, OperationType.ADD);
		dataOperation.operate(4, 2, OperationType.SUBTRACT);
		dataOperation.operate(4, 2, OperationType.MULTIPLY);
		dataOperation.operate(4, 2, OperationType.DIVIDE);
		System.out.println("With lamda");
		dataOperation = new DataOperatorWithLambda();
		dataOperation.operate(4, 2, OperationType.ADD);
		dataOperation.operate(4, 2, OperationType.SUBTRACT);
		dataOperation.operate(4, 2, OperationType.MULTIPLY);
		dataOperation.operate(4, 2, OperationType.DIVIDE);
	}
	
}
