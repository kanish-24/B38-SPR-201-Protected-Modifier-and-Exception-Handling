package user;

import framework.FrameworkComponent;

public class CustomComponent extends FrameworkComponent {
	

	    @Override
	    protected void performTask() {
	        System.out.println("Performing custom task");
	    }

	    public static void main(String[] args) {
	        CustomComponent component = new CustomComponent();
	        component.initialize();  // Accessible because it's protected
	        component.performTask(); // Calls the overridden method
	    }
	}



