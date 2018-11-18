package lab9.operation.nolambda;

import lab9.operation.Operation;

public class OperationFactory {

	public Operation getOperation(OperationType operationType) {
		if(OperationType.ADD.equals(operationType)) {
			return new AddOperation();
		}else if(OperationType.SUBTRACT.equals(operationType)) {
			return new SubtractOperation();
		}else if(OperationType.MULTIPLY.equals(operationType)) {
			return new MultiplyOperation();
		}else if(OperationType.DIVIDE.equals(operationType)) {
			return new DivideOperation();
		}else {
			throw new IllegalArgumentException(); 
		}
	}
	
}
