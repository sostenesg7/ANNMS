/*
 * Copyright (c) Welsiton Ferreira (wfcreations@gmail.com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *  list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice, this
 *  list of conditions and the following disclaimer in the documentation and/or
 *  other materials provided with the distribution.
 *
 *  Neither the name of the WFCreation nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package br.com.wfcreations.annms.core.neuralnetwork;

import java.io.Serializable;

import br.com.wfcreations.annms.api.data.Param;
import br.com.wfcreations.annms.api.data.value.ID;
import br.com.wfcreations.annms.api.neuralnetwork.INeuralNetwork;

public class NeuralnetworkWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String model;

	private final Param[] params;

	private final INeuralNetwork neuralnetwork;

	private ID id;

	public NeuralnetworkWrapper(ID id, String model, Param[] params, INeuralNetwork neuralnetwork) {
		this.id = id;
		this.model = model;
		this.params = params;
		this.neuralnetwork = neuralnetwork;
	}

	public String getModel() {
		return model;
	}

	public Param[] getParams() {
		return params;
	}

	public INeuralNetwork getNeuralnetwork() {
		return neuralnetwork;
	}

	public ID getID() {
		return id;
	}
}