package edu.self.kraken.model;

import java.util.List;

public class AssetTickerInfo {
	private String pair;

	private List<String> a = null;

	private List<String> b;

	private List<String> c;

	private List<String> v;

	private List<String> p;

	private List<Integer> t;

	private List<String> l;

	private List<String> h;

	private String o;

	public AssetTickerInfo() {
		super();
	}

	public AssetTickerInfo(String pair, List<String> a, List<String> b, List<String> c, List<String> v, List<String> p,
			List<Integer> t, List<String> l, List<String> h, String o) {
		super();
		this.pair = pair;
		this.a = a;
		this.b = b;
		this.c = c;
		this.v = v;
		this.p = p;
		this.t = t;
		this.l = l;
		this.h = h;
		this.o = o;
	}

	public String getPair() {
		return pair;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public List<String> getA() {
		return a;
	}

	public void setA(List<String> a) {
		this.a = a;
	}

	public List<String> getB() {
		return b;
	}

	public void setB(List<String> b) {
		this.b = b;
	}

	public List<String> getC() {
		return c;
	}

	public void setC(List<String> c) {
		this.c = c;
	}

	public List<String> getV() {
		return v;
	}

	public void setV(List<String> v) {
		this.v = v;
	}

	public List<String> getP() {
		return p;
	}

	public void setP(List<String> p) {
		this.p = p;
	}

	public List<Integer> getT() {
		return t;
	}

	public void setT(List<Integer> t) {
		this.t = t;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}

	public List<String> getH() {
		return h;
	}

	public void setH(List<String> h) {
		this.h = h;
	}

	public String getO() {
		return o;
	}

	public void setO(String o) {
		this.o = o;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssetTickerInfo [pair=").append(pair).append(", a=").append(a).append(", b=").append(b)
				.append(", c=").append(c).append(", v=").append(v).append(", p=").append(p).append(", t=").append(t)
				.append(", l=").append(l).append(", h=").append(h).append(", o=").append(o).append("]");
		return builder.toString();
	}
}
