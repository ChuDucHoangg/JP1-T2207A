package session2;

public class ChuaPhanSo {
    public int tuSo;
    public int mauSo;

    public  void print() {
        System.out.println(tuSo+ "/" +mauSo);
    }

    public  void rutGon() {
        int ucln = 1;
        int min = Math.min(Math.abs(tuSo),Math.abs(mauSo));
        for(int i = min;i > 1;i--){
            if(tuSo%i==0 && mauSo%i==0){
                ucln = i;
                break;
            }
        }
        tuSo = tuSo/ucln;
        mauSo = mauSo/ucln;
    }

    public void nghichDao() {
        if (tuSo != 0) {
            int trunggian = tuSo;
            tuSo = mauSo;
            mauSo = trunggian;
        }
    }

    public ChuaPhanSo add(ChuaPhanSo f) {
        int ts = (this.tuSo*f.mauSo) + (this.mauSo*f.tuSo);
        int ms = this.mauSo * f.mauSo;
        ChuaPhanSo tong = new ChuaPhanSo();
        tong.tuSo = ts;
        tong.mauSo = ms;
        return  tong;
    }

    public ChuaPhanSo sub(ChuaPhanSo g) {
        int ts = (this.tuSo*g.mauSo) - (this.mauSo*g.tuSo);
        int ms = this.mauSo*g.mauSo;
        ChuaPhanSo tru = new ChuaPhanSo();
        tru.tuSo = ts;
        tru.mauSo = ms;
        return  tru;
    }

    public ChuaPhanSo mul(ChuaPhanSo h) {
        int ts = this.tuSo * h.tuSo;
        int ms = this.tuSo * h.mauSo;
        ChuaPhanSo nhan = new ChuaPhanSo();
        nhan.tuSo = ts;
        nhan.mauSo = ms;
        return nhan;
    }

    public ChuaPhanSo div(ChuaPhanSo j) {
        if(j.tuSo != 0) {
            int ts = this.tuSo * j.mauSo;
            int ms = this.mauSo * j.tuSo;
            ChuaPhanSo chia = new ChuaPhanSo();
            chia.tuSo = ts;
            chia.mauSo = ms;
            return chia;
        }
        return null;
    }
}
