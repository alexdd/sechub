// SPDX-License-Identifier: MIT
package com.daimler.sechub.sharedkernel.configuration.login;

import java.util.Optional;

public class ScriptEntry {

	String action;

	Optional<String> selector = Optional.empty();

	Optional<String> value = Optional.empty();
	
	Optional<String> description = Optional.empty();


    /**
	 * @return type of action as string (e.g. "input", "click")
	 */
	public String getAction() {
		return action;
	}
	public Optional<String> getSelector() {
		return selector;
	}

    public Optional<String> getValue() {
        return value;
    }

    public Optional<String> getDescription() {
        return description;
    }
}
