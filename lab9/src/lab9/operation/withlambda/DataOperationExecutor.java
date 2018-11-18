package lab9.operation.withlambda;

import java.util.HashMap;
import java.util.Map;

import lab9.operation.Operation;
import lab9.operation.nolambda.OperationType;

public class DataOperationExecutor {

	private Map<OperationType, Operation> opMap = new HashMap<>();
	
	public DataOperationExecutor() {
		opMap.put(OperationType.ADD, (x,y)-> {return x+y;});
		opMap.put(OperationType.SUBTRACT, (x,y)-> {return x-y;});
		opMap.put(OperationType.MULTIPLY, (x,y)-> {return x*y;});
		opMap.put(OperationType.DIVIDE, (x,y)-> {return x/y;});
	}
	
	public int execute(int x, int y, OperationType operationType) {
		return opMap.get(operationType).execute(x, y);
	}

}
