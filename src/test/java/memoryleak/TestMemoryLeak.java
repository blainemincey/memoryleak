package memoryleak;

import org.junit.Test;

import com.jboss.memoryleak.Memory;
import com.jboss.memoryleak.MemoryLeak;

import junit.framework.TestCase;

/**
 * @author bmincey
 *
 */
public class TestMemoryLeak extends TestCase {
	
	/**
	 * 
	 */
	@Test
	public void testMemoryLeak(){
		
		Memory.getMemory();
		MemoryLeak.startMemoryLeak();
		Memory.getMemory();
		
	}
	
}
