/**
 * Copyright 2010 Molindo GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.molindo.webtools.crawler.filter;

import at.molindo.webtools.crawler.CrawlerTask;

public class ContainsStringFilter implements ICrawlerFilter {

	private static final long serialVersionUID = 1L;

	private final String _string;

	public ContainsStringFilter(final String string) {
		if (string == null) {
			throw new NullPointerException("string");
		}
		if (string.isEmpty()) {
			throw new IllegalArgumentException("string must not be empty");
		}
		_string = string;
	}

	@Override
	public boolean filter(final CrawlerTask task) {
		return task.getUrlString().contains(_string);
	}

}
