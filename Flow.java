public enum Flow {

    CreateProj(1){
        @Override
        public Flow NextFlow() {
            System.out.println(this.name() + " complete");
            return WriteInfo;
        }

        @Override
        public Flow PreFlow() {
            return null;
        }
    }, WriteInfo(1){
        @Override
        public Flow NextFlow() {
            System.out.println(this.name() + " complete");

            return UploadFile;
        }

        @Override
        public Flow PreFlow() {
            return CreateProj;
        }
    },UploadFile(1){
        @Override
        public Flow NextFlow() {
            System.out.println(this.name() + " complete");

            return ArchiveProj;
        }

        @Override
        public Flow PreFlow() {
            return WriteInfo;
        }
    },ArchiveProj(1){
        @Override
        public Flow NextFlow() {
            System.out.println(this.name() + " complete");

            return null;
        }

        @Override
        public Flow PreFlow() {
            return UploadFile;
        }
    };



    private int flowStatus;
    private List<Task> taskList;

    Flow(int flowStatus){
        this.flowStatus = flowStatus;
    }

    public int getFlowStatus(){
        return this.flowStatus;
    }

    public void InsertTask(Task task){
        taskList.add(task);
    }
    public void setStatus(int status){
        this.flowStatus = status;
    }
    public abstract Flow NextFlow();
    public abstract Flow PreFlow();
}
