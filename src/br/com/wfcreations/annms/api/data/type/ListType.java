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
package br.com.wfcreations.annms.api.data.type;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.wfcreations.annms.api.data.values.IDValue;
import br.com.wfcreations.annms.api.data.values.Value;

public class ListType implements IType {

	private static final long serialVersionUID = 1L;

	private final ArrayList<String> listValues;

	public ListType(String[] listValues) {
		this.listValues = new ArrayList<>(Arrays.asList(listValues));
	}

	public String getListValuesAt(int index) {
		return listValues.get(index);
	}

	public int getListValuesNum() {
		return listValues.size();
	}

	@Override
	public boolean valid(Value value) {
		return value.getClass().equals(IDValue.class) && Arrays.asList(listValues).contains(value.getValue());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListType other = (ListType) obj;
		if (this.getListValuesNum() != other.getListValuesNum())
			return false;
		boolean eq = true;
		for (int i = 0; i < this.getListValuesNum(); i++) {
			eq = eq && this.getListValuesAt(i).equals(other.getListValuesAt(i));
			if (!eq)
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return Arrays.toString(listValues.toArray(new String[listValues.size()])).replace('[', '{').replace(']', '}');
	}
}