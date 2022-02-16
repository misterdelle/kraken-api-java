package edu.self.kraken.model;

import java.util.List;

public class AssetTickerInfoDetail {
	private List<String> a;

	private List<String> b;

	private List<String> c;

	private List<String> v;

	private List<String> p;

	private List<Integer> t;

	private List<String> l;

	private List<String> h;

	private String o;

	public AssetTickerInfoDetail() {
		super();
	}

	public AssetTickerInfoDetail(List<String> a, List<String> b, List<String> c, List<String> v, List<String> p,
			List<Integer> t, List<String> l, List<String> h, String o) {
		super();
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
		return "AssetTickerInfoDetail [a=" + a + ", b=" + b + ", c=" + c + ", v=" + v + ", p=" + p + ", t=" + t + ", l="
				+ l + ", h=" + h + ", o=" + o + "]";
	}

	
}
