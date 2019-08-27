
public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex() {
        this.imag=imag;
        this.real=real;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }


    public void setValue(double imag, double real){

    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }

    public boolean isReal(){
        boolean flag;
        if(this.imag==0){
            flag=false;
        }else{
            flag=true;
        }
        return flag;
    }
    public boolean isImag(){
        boolean flag;
        if(this.imag!=1){
            flag=false;
        }else{
            flag=true;
        }
        return flag;
    }

    public boolean equals(double real, double imag){
        boolean bool;
        if(this.imag==this.real){
            bool=true;
        }else{
            bool=false;
        }
        return bool;
    }

    public boolean equals(MyComplex myComplex){
            boolean bol;
        if(this.real== myComplex.real && this.imag==myComplex.imag){
            bol=true;
        }else{
            bol=false;
        }
        return bol;
    }


    public MyComplex add(MyComplex myComplex){
        this.real+=myComplex.real;
        this.imag+=myComplex.imag;

        return this;
    }
    public MyComplex substrac(MyComplex myComplex){
        this.real-=myComplex.real;
        this.imag-=myComplex.imag;

        return this;
    }
    public MyComplex multplicar(MyComplex myComplex){
        this.real*=myComplex.real;
        this.imag*=myComplex.imag;

        return this;
    }
    public MyComplex divide(MyComplex myComplex){
        this.real/=myComplex.real;
        this.imag/=myComplex.imag;

        return this;
    }
    public MyComplex addNew(MyComplex myComplex){

        MyComplex myComplex1=new MyComplex(this.real+myComplex.real,this.imag+myComplex.imag);


        return myComplex1;
    }
    public MyComplex substracNew(MyComplex myComplex){

        MyComplex myComplex1=new MyComplex(this.real-myComplex.real,this.imag-myComplex.imag);


        return myComplex1;
    }
    public MyComplex multiplicarNew(MyComplex myComplex){

        MyComplex myComplex1=new MyComplex(this.real*myComplex.real,this.imag*myComplex.imag);


        return myComplex1;
    }
    public MyComplex divideNew(MyComplex myComplex){

        MyComplex myComplex1=new MyComplex(this.real/myComplex.real,this.imag/myComplex.imag);


        return myComplex1;
    }
    public MyComplex conjugate(){
        this.imag*=-1;

        return this;
    }






















}



