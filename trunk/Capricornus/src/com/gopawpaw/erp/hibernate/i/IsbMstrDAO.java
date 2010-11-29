package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IsbMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IsbMstr
 * @author MyEclipse Persistence Tools
 */

public class IsbMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IsbMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IsbMstr transientInstance) {
		log.debug("saving IsbMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IsbMstr persistentInstance) {
		log.debug("deleting IsbMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IsbMstr findById(com.gopawpaw.erp.hibernate.i.IsbMstrId id) {
		log.debug("getting IsbMstr instance with id: " + id);
		try {
			IsbMstr instance = (IsbMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IsbMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IsbMstr instance) {
		log.debug("finding IsbMstr instance by example");
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
		log.debug("finding IsbMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IsbMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IsbMstr instances");
		try {
			String queryString = "from IsbMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IsbMstr merge(IsbMstr detachedInstance) {
		log.debug("merging IsbMstr instance");
		try {
			IsbMstr result = (IsbMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IsbMstr instance) {
		log.debug("attaching dirty IsbMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IsbMstr instance) {
		log.debug("attaching clean IsbMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IsbMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IsbMstrDAO) ctx.getBean("IsbMstrDAO");
	}
}