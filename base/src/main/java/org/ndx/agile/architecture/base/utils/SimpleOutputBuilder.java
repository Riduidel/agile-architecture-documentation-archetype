package org.ndx.agile.architecture.base.utils;

import java.io.File;

import org.ndx.agile.architecture.base.AgileArchitectureSection;
import org.ndx.agile.architecture.base.Enhancer;
import org.ndx.agile.architecture.base.OutputBuilder;

import com.structurizr.model.Element;

public class SimpleOutputBuilder implements OutputBuilder {
	private final File enhancementsBase;
	public static final String SECTION_PATTERN = "%02d-%s";

	public SimpleOutputBuilder(File outputBase) {
		super();
		this.enhancementsBase = outputBase;
	}

	@Override
	public File outputFor(AgileArchitectureSection section, Element element, Enhancer enhancer, String format) {
		return new File(enhancementsBase,
				// Yup, we use hex values for priority, to have less characters
				String.format("%s/"+SECTION_PATTERN+"/_%08x-%s.%s", 
					StructurizrUtils.getCanonicalPath(element),
					section.index(), section.name(),
					enhancer.priority(), enhancer.getClass().getSimpleName(), format
					)
				);
	}

	@Override
	public File outputFor(AgileArchitectureSection section, Element element) {
		return new File(enhancementsBase,
				// Yup, we use hex values for priority, to have less characters
				String.format("%s/"+SECTION_PATTERN, 
					StructurizrUtils.getCanonicalPath(element),
					section.index(), section.name()
					)
				);
	}

}
