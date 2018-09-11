
# SingletonSample


    private LoginModelImpl() { }

    private static class InnerLoginModel {
        public static LoginModelImpl sInstance = new LoginModelImpl();
    }

    public static LoginModelImpl getInstance() {
        return InnerLoginModel.sInstance;
    }
    
    
