package containerFactory;

import container.IBag;

public abstract interface IBagFactory {
    
    IBag makeBag(String type);
    
  }

