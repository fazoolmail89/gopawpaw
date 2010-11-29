package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SchMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SchMstr
 * @author MyEclipse Persistence Tools
 */

public class SchMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SchMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SchMstr transientInstance) {
		log.debug("saving SchMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SchMstr persistentInstance) {
		log.debug("deleting SchMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchMstr findById(com.gopawpaw.erp.hibernate.s.SchMstrId id) {
		log.debug("getting SchMstr instance with id: " + id);
		try {
			SchMstr instance = (SchMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SchMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SchMstr instance) {
		log.debug("finding SchMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SchMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SchMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SchMstr instances");
		try {
			String queryString = "from SchMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SchMstr merge(SchMstr detachedInstance) {
		log.debug("merging SchMstr instance");
		try {
			SchMstr result = (SchMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SchMstr instance) {
		log.debug("attaching dirty SchMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchMstr instance) {
		log.debug("attaching clean SchMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SchMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SchMstrDAO) ctx.getBean("SchMstrDAO");
	}
}