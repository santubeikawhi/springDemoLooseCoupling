package com.jl.spring.Helper;

import com.jl.spring.generate.IOutputGenerator;

public class OutputHelper {
	private IOutputGenerator iOutputGenerator;

	public IOutputGenerator getiOutputGenerator() {
		return iOutputGenerator;
	}

	public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
		this.iOutputGenerator = iOutputGenerator;
	}
	
	public void generatorOutput(){
		iOutputGenerator.generatorOutput();
	}
}
